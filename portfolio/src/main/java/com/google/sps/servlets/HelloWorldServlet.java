package com.google.sps.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

    private String name = "Adwait";

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("This is number 1!");
    arrayList.add("Hello from number 2!");
    arrayList.add("Number 3 here!");
    response.setContentType("text/html;");
    Gson gson = new Gson();
    String json = gson.toJson(arrayList);
    response.getWriter().println(json);
  }
}
