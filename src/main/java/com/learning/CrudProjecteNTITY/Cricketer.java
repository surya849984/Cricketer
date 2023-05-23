package com.learning.CrudProjecteNTITY;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cricketer")
public class Cricketer {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;
private int age;
private String country;
private String battingStyle;
private String bowlingStyle;
private int teamId;

public Cricketer(Long id, String name, int age, String country, String battingStyle, String bowlingStyle, int teamId) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.country = country;
	this.battingStyle = battingStyle;
	this.bowlingStyle = bowlingStyle;
	this.teamId = teamId;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public String getBattingStyle() {
	return battingStyle;
}

public void setBattingStyle(String battingStyle) {
	this.battingStyle = battingStyle;
}

public String getBowlingStyle() {
	return bowlingStyle;
}

public void setBowlingStyle(String bowlingStyle) {
	this.bowlingStyle = bowlingStyle;
}

public int getTeamId() {
	return teamId;
}

public void setTeamId(int teamId) {
	this.teamId = teamId;
}

}
