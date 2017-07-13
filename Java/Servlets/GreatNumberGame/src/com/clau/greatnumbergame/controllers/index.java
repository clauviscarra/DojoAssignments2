package com.clau.greatnumbergame.controllers;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public index() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
		view.forward(request, response);
	}
	
	public int rndNum(){
		return new Random().nextInt(100) +1;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String res = "";
		HttpSession session = request.getSession();
			
	      
        if(session.getAttribute("num") == null){
        	session.setAttribute("num", rndNum());
        }
        else{
        	int sv = (Integer)session.getAttribute("num");
        	int cl = Integer.parseInt(request.getParameter("number"));
        	
        	if(sv == cl){
        		res = "You win!";
        		sv = rndNum();
        		session.setAttribute("num", sv);
        		request.setAttribute("number", Integer.toString(cl)); 
        	}else if (sv > cl){
        		
        		res = "Too low";
        	}
        	else{
        		res = "Too high";
        	}
        }
        
         
        session.setAttribute("res", res);
      
       		
		doGet(request, response);
			
	}

}
