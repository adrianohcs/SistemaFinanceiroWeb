package br.com.minhaempresa.controller;

import br.com.minhaempresa.service.ConsultaSaldoService;
import br.com.minhaempresa.service.DepositarService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/depositar")
public class DepositarController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String sobrenome = req.getParameter("sobrenome");
        double valor = Double.valueOf(req.getParameter("valor"));

        DepositarService depositoService = new DepositarService();
        depositoService.depositar(nome, sobrenome, valor);
    }
}