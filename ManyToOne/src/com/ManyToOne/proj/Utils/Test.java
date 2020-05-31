package com.ManyToOne.proj.Utils;


import com.ManyToOne.proj.DAO.DAOLogic;
import com.ManyToOne.proj.DTO.Hero;
import com.ManyToOne.proj.DTO.Movie;

public class Test
{
  public static void main(String[] args) 
  {
	 
	  
	  Hero hero = new Hero();
	  hero.setName("RobertDowniJunier");
	  hero.setAge(58);
	  hero.setSal(250000.00);
	  
	  Movie movie = new Movie();
	  movie.setName("SherlockHolmes");
	  movie.setBoxOffice(50000.00);
	  movie.setHero(hero);
	
	  
	  Movie movie1 = new Movie();
	  movie1.setName("Dolittle");
	  movie1.setBoxOffice(2020000.00);
	  movie1.setHero(hero);
	  
	  DAOLogic logic = new DAOLogic();
	  logic.saveMovie(movie);
	  logic.saveMovie(movie1);
	  
	 
	  
	  
	 
  }
}
