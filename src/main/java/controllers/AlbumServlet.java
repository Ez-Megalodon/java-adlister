package controllers;

import dao.AlbumDao;
import dao.Albums;
import models.Album;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/albums")
public class AlbumServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Albums albumDao = new AlbumDao();
        List<Album> albums = albumDao.all();
        req.setAttribute("albums", albums);
        req.getRequestDispatcher("albums.jsp").forward(req, resp);
    }
}
