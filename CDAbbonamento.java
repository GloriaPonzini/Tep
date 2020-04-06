package jgvf;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Abbonamento {
	//attributi
		private String id_abbonamento;
		private String tipologia;

		//default
		public Abbonamento() {
			id_abbonamento = null;
			tipologia = null;
		}

		public String getId_abbonamento() {
			return id_abbonamento;
		}

		public void setId_abbonamento(String id_abbonamento) {
			this.id_abbonamento = id_abbonamento;
		}

		public String getTipologia() {
			return tipologia;
		}

		public void setTipologia(String tipologia) {
			this.tipologia = tipologia;
		}
		
		public void data() {
			LocalDate data = LocalDate.of(2020, Month.APRIL, 6);
			int anno = data.getYear();
			Month mese= data.getMonth();
			int giornoDelMese = data.getDayOfMonth();
			DayOfWeek giornoDellaSettimana = data.getDayOfWeek();
			int giorniDelMese =data.lengthOfMonth();
			boolean bisestile = data.isLeapYear();
			data = data.plusMonths(1);
			data = data.plusDays(1);
			return;
		}

		public void orario() {	
			LocalTime tempo = LocalTime.of(12, 00);
			int ora = tempo.getHour();
			int minuto = tempo.getMinute();
			tempo = tempo.withSecond(2);
			tempo = tempo.plusMinutes(2);
			return;
		}
		
		public void dataOra() {	
			LocalDateTime dt1 = LocalDateTime.of(2020,Month.APRIL,10, 12,00);
			LocalDateTime dt2 = LocalDateTime.of(data, tempo);
			LocalDateTime dt3 = data.atTime(13, 00);
			LocalDateTime dt4 = data.atTime(tempo);

		}
		
		//Inizio aggiunta
		 public void rinnovaAbbonamento(Abbonamento id_abbonamento, int durata){
			 
			return ;
		}
		 
		 //Fine aggiunta
		public String toString() {
			return "ID =" + id_abbonamento + ", Tipologia abbonamento =" + tipologia;
		}
}