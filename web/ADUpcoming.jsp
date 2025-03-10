<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="styles/ADUpcoming.css">
        <title>ABC Cinema | Upcoming</title>
    </head>
    <body>
        <%
            String user = (String) session.getAttribute("admin");

            if (user == null) {
                response.sendRedirect(request.getContextPath() + "/ADLogin.jsp");
            }
        %>
        <header>
            <nav>
                <img src="assets/logo header.png" alt="header logo" class="logo">
                <ul>
                    <div class="nav-right">
                        <li>
                            <h5>Admin</h5>
                        </li>
                    </div>
                </ul>
            </nav>
        </header>
        <div class="container-main">
            <div class="side-menu">
                <menu>
                    <ul>
                        <li><a href="ADdashboard.jsp">
                                <p>Dashboard</p>
                            </a></li>
                        <li><a href="ADPremiere.jsp">
                                <p>Premiere</p>
                            </a></li>
                        <li><a href="ADbookingjsp.jsp">
                                <p>Bookings</p>
                            </a></li>
                        <li><a class="active" href="ADUpcoming.jsp">
                                <p>Upcoming</p>
                            </a></li>
                        <li><a href="#">
                                <p>Log-out</p>
                            </a></li>
                    </ul>
                </menu>
            </div>
            <div class="watch-movie">
                <div class="movies">
                    <a href="ADUpcoming-edit.jsp"><i id="add-btn" class="fa-solid fa-circle-plus"></i></a>
                        <%
                            Connection conn = null;
                            Statement stmnt = null;
                            ResultSet rs = null;

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/abc_cinema", "root", "");
                                stmnt = conn.createStatement();

                                String qry = "select * from upcomming_movies";

                                rs = stmnt.executeQuery(qry);

                                while (rs.next()) {
                        %>
                    <div class="movie">
                        <form action="upcoming edit.jsp">
                        <input type="hidden" id="movieName" name="movieName" value="<%=rs.getString(2)%>">
                        <img class="banner-01" src="uploads/<%=rs.getString(7)%>" alt="banner">
                        <h2><%=rs.getString(2)%></h2>
                        <div class="actions">
                            <h6><%=rs.getString(3)%></h6>
                            <div class="icons">
                                <input type="submit" value="Edit" >
                                <a href="upcoming edit.jsp"><i class="far fa-edit"></i></a>
                                <i class="fas fa-trash"></i>
                            </div>
                        </div>
                        </form>
                    </div>
                    <%

                            }
                        } catch (Exception e) {
                            out.print(e);
                        }

                    %>
                    <div class="movie">
                        <img class="banner-01" src="assets/Batman.jpg" alt="banner">
                        <h2>The Batman</h2>
                        <div class="actions">
                            <h6>Tuesday</h6>
                            <div class="icons">
                                <a href="upcoming edit.jsp"><i class="far fa-edit"></i></a>
                                <i class="fas fa-trash"></i>
                            </div>
                        </div>
                    </div>
                    <div class="movie">
                        <img class="banner-01" src="assets/after ever happy.jpg" alt="banner">
                        <h2>After Ever Happy</h2>
                        <div class="actions">
                            <h6>Yesterday</h6>
                            <div class="icons">
                                <a href="ADUpcoming-edit.jsp"><i class="far fa-edit"></i></a>
                                <i class="fas fa-trash"></i>
                            </div>
                        </div>
                    </div>
                    <div class="movie">
                        <img class="banner-01" src="assets/black adam.jpg" alt="banner">
                        <h2>Black Adam</h2>
                        <div class="actions">
                            <h6>Yesterday</h6>
                            <div class="icons">
                                <a href="ADUpcoming-edit.jsp"><i class="far fa-edit"></i></a>
                                <i class="fas fa-trash"></i>
                            </div>
                        </div>
                    </div>
                    <div class="movie">
                        <img class="banner-01" src="assets/smile.jpg" alt="banner">
                        <h2>Smile</h2>
                        <div class="actions">
                            <h6>Yesterday</h6>
                            <div class="icons">
                                <a href="ADUpcoming-edit.jsp"><i class="far fa-edit"></i></a>
                                <i class="fas fa-trash"></i>
                            </div>
                        </div>
                    </div>
                    <div class="movie">
                        <img class="banner-01" src="assets/babylon.jpg" alt="banner">
                        <h2>Babylon</h2>
                        <div class="actions">
                            <h6>Yesterday</h6>
                            <div class="icons">
                                <a href="ADUpcoming-edit.jsp"><i class="far fa-edit"></i></a>
                                <i class="fas fa-trash"></i>
                            </div>
                        </div>
                    </div>
                    <div class="movie">
                        <img class="banner-01" src="assets/Jurasic world.jpg" alt="banner">
                        <h2>Jurasic World</h2>
                        <div class="actions">
                            <h6>Yesterday</h6>
                            <div class="icons">
                                <a href="ADUpcoming-edit.jsp"><i class="far fa-edit"></i></a>
                                <i class="fas fa-trash"></i>
                            </div>
                        </div>
                    </div>
                    <div class="movie">
                        <img class="banner-01" src="assets/thor.jpg" alt="banner">
                        <h2>Thor</h2>
                        <div class="actions">
                            <h6>Yesterday</h6>
                            <div class="icons">
                                <a href="ADUpcoming-edit.jsp"><i class="far fa-edit"></i></a>
                                <i class="fas fa-trash"></i>
                            </div>
                        </div>
                    </div>
                    <div class="movie">
                        <img class="banner-01" src="assets/violent night.jpg" alt="banner">
                        <h2>Violent Night</h2>
                        <div class="actions">
                            <h6>Yesterday</h6>
                            <div class="icons">
                                <a href="ADUpcoming-edit.jsp"><i class="far fa-edit"></i></a>
                                <i class="fas fa-trash"></i>
                            </div>
                        </div>
                    </div>
                    <div class="movie">
                        <img class="banner-01" src="assets/dhokha.jpg" alt="banner">
                        <h2>Dhokha</h2>
                        <div class="actions">
                            <h6>Yesterday</h6>
                            <div class="icons">
                                <a href="ADUpcoming-edit.jsp"><i class="far fa-edit"></i></a>
                                <i class="fas fa-trash"></i>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="https://kit.fontawesome.com/608ce7278f.js" crossorigin="anonymous"></script>
    </body>
</html>
