package org.rekdev;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
  public static final Logger LOG = LoggerFactory.getLogger(HelloServlet.class);

  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    PrintWriter out = res.getWriter();
    LOG.info("doGet(req: {}, res: {})", req, res);
    out.println("Hello, world!");
    out.close();
  }
}