package br.com.polotech925.hellowordservlet;
import br.com.polotech925.hellowordservlet.ClienteFactory;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.http.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "CadatsrarServlet", value = "/cadastrar")
public class CadastrarServlet extends HttpServlet {
    private List<Cliente> clientes = new ArrayList<>();
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        BigDecimal cpf = new BigDecimal(request.getParameter("cpf"));
        String tipo = request.getParameter("tipo");

        Cliente cliente = ClienteFactory.cadastrar(tipo);
        cliente.cadastrar(nome, cpf);
        this.clientes.add(cliente);
        request.setAttribute("nome", nome);
        request.setAttribute("cpf", cpf);
        request.setAttribute("tipo", tipo);
        request.setAttribute("historico_clientes", this.clientes);
        request.getRequestDispatcher("/lista.jsp").forward(request, response);
    }

    private List<Cliente> recuperaCadastros(HttpServletRequest request) {
        HttpSession session = request.getSession(true);
        List<Cliente> cadastros = (List<Cliente>) session.getAttribute("lista_cadastros");
        if (cadastros == null) {
            cadastros = new ArrayList<>();
            session.setAttribute("lista_cadastros", cadastros);
        }
        return cadastros;
    }
}