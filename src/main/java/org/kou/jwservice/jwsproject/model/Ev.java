package org.kou.jwservice.jwsproject.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Ev {

	private Integer Id;
	private String il;
	private String emlakTipi;
	private Integer alan;
	private Integer odaSayisi;
	private Integer binaYasi;
	private Integer bulKat;
	private Double fiyat;
	private String aciklama;
	private String resimYol;
	
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getIl() {
		return il;
	}
	public void setIl(String il) {
		this.il = il;
	}
	public String getEmlakTipi() {
		return emlakTipi;
	}
	public void setEmlakTipi(String emlakTipi) {
		this.emlakTipi = emlakTipi;
	}
	public Integer getAlan() {
		return alan;
	}
	public void setAlan(Integer alan) {
		this.alan = alan;
	}
	public Integer getOdaSayisi() {
		return odaSayisi;
	}
	public void setOdaSayisi(Integer odaSayisi) {
		this.odaSayisi = odaSayisi;
	}
	public Integer getBinaYasi() {
		return binaYasi;
	}
	public void setBinaYasi(Integer binaYasi) {
		this.binaYasi = binaYasi;
	}
	public Integer getBulKat() {
		return bulKat;
	}
	public void setBulKat(Integer bulKat) {
		this.bulKat = bulKat;
	}
	public Double getFiyat() {
		return fiyat;
	}
	public void setFiyat(Double fiyat) {
		this.fiyat = fiyat;
	}
	public String getAciklama() {
		return aciklama;
	}
	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}
	public String getResimYol() {
		return resimYol;
	}
	public void setResimYol(String resimYol) {
		this.resimYol = resimYol;
	}
	
	
	
	
}
