package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/square")
public class SquareServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		HttpSession session = req.getSession();
		int k = (int)session.getAttribute("k");
		
		PrintWriter sq = res.getWriter();
		sq.println(k*k);
	}
	
	public void doPost(HttpServletRequest req ,HttpServletResponse res) throws IOException {
		doGet(req,res);
	}

}
