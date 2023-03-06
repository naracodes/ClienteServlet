package br.com.polotech925.hellowordservlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ListarServlet", value = "/lista_cadastros")
public class ListarServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession(true);
        var cadastros = (List<Cliente>) session.getAttribute("lista_cadastros");
        if (cadastros == null) {
            cadastros = new ArrayList<>();
        }
        request.setAttribute("lista_cadastros", cadastros);
        request.getRequestDispatcher("/lista_cadastros.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
