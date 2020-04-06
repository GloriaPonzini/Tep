//*:vuol dire che importa tutte le librerie che ha all'interno java.io
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * classe per la gestione sequenziale di un file di testo
 */
public class TextFile {
	private char mode;
	private BufferedReader reader;
	private BufferedWriter writer;
/**
 * costruisce un oggetto di tipo BufferedReader/
 * BufferedWriter
 * sopra il file specificato dal nome indicato.
 * @param filename percorso e nome del file
 * @param mode R per la sola lettura, W per sola scrittura
 */
public TextFile(String filename, char mode) throws IOException
{
	this.mode = 'R';
	if(mode == 'W' || mode == 'w'){
		this.mode = 'W';
		//crea oggetti in scrittura su file e in lettura 
		writer = new BufferedWriter(new FileWriter(filename));
	}
	else {
		reader = new BufferedReader(new FileReader(filename));
	}
}
/**
 * scrive una riga di testo in un file aperto in scrittura.
 * @param line riga di testo da scrivere nel file
 * @throws FileException se il file � aperto in lettura
 */
public void toFile(String line) throws FileException, IOException
{
	if(this.mode == 'R') throw new FileException("Read-only"+"file!");
	writer.write(line);
	writer.newLine();//newLine:vuol dire manda a capo 
}
/**
 * legge una riga di testo da un file aperto in lettura.
 * @return riga di testo letta dal file
 * @throws FileException se il file � aperto in scrittura
 * @throws FileException se � stata raggiunta la fine del file
 */
public String fromFile() throws FileException, IOException//throws:lancia un eccezione,ha lo scopo di gestire le eccezioni
{
	String tmp;
	
	if(this.mode == 'W') throw new FileException("Write-only"+"file!");//se lo apri in scrittura ti da errore
	tmp = reader.readLine();
	
	if(tmp == null) throw new FileException("End of file!");
	return tmp;
}
/**
 * chiude il file aperto dal costruttore
 */
public void closeFile() throws IOException 
{
	if(this.mode == 'W')
		writer.close();//close:chiudo il file se lo apro devo sempre chiuderlo
	else //this.mode == 'R'
		reader.close();
}
}