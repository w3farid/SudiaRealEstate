<%-- 
    Document   : report
    Created on : Apr 2, 2016, 12:18:01 AM
    Author     : shahidur
--%>

<%@page import="java.io.File"%>
<%@page import="java.sql.DriverManager"%>

<%@page import="java.util.Map"%>
<%@page import="net.sf.jasperreports.engine.JasperExportManager"%>
<%@page import="net.sf.jasperreports.engine.JasperPrint"%>
<%@page import="net.sf.jasperreports.engine.JasperFillManager"%>
<%@page import="java.util.HashMap"%>
<%@page import="net.sf.jasperreports.engine.JasperReport"%>
<%@page import="net.sf.jasperreports.engine.JasperCompileManager"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.sql.Connection"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            try {
                //response.setContentType("application/pdf");
                Connection conn = null;
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/realstatedb", "root", "farid");
                String s = session.getServletContext().getRealPath("/totalsale.jrxml");
                InputStream inputStream = new FileInputStream(new File(s));
                JasperReport jr = JasperCompileManager.compileReport(inputStream);
                Map param = new HashMap();
               
                JasperPrint jp = JasperFillManager.fillReport(jr, param, conn);
                response.setContentType("application/pdf");
                JasperExportManager.exportReportToPdfStream(jp, response.getOutputStream());
                response.getOutputStream().flush();
                response.getOutputStream().close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        %>
    </body>
</html>
