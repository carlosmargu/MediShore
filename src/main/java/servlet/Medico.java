package servlet;

import Adapter.Usuario;
import Facade.AdminCitas;
import Facade.Facede;
import java.io.IOException;
import Composite.HistoriaClinica;
import Composite.PacienteHC;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
//import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletOutputStream;

@WebServlet(
        name = "Medico",
        urlPatterns = {"/agendar","/medico","/iniciarconsulta","/historiaClinica","/buscarHistoria","/vertodash"}
)

public class Medico extends HttpServlet {

    RequestDispatcher rd;
    Facede facade = Facede.rConstructora();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String url = req.getServletPath();
        if (url.equalsIgnoreCase("/agendar")) {
            String medico = (String) req.getAttribute("medico");
            String fecha1 = req.getParameter("fecha");
            String hI1 = req.getParameter("horaI");
            String hF1 = req.getParameter("horaF");
            String hI2 = req.getParameter("horaI2");
            String hF2 = req.getParameter("horaF2");
            facade.AgregarAgenda("nikolas", fecha1, hI1, hF1, hI2, hF2);
            
        } 
        else if(url.equalsIgnoreCase("/medico")){
            String medico = req.getParameter("medico");
             req.setAttribute("medico", medico);
                rd = req.getRequestDispatcher("/Disponibilidad.jsp");
                rd.forward(req, resp);
                //ssa
        }
        
            else if (url.equalsIgnoreCase("/iniciarconsulta")){
            String cc = req.getParameter("cc");
            if(cc!=null){
            req.setAttribute("cedula",cc);
            rd = req.getRequestDispatcher("/Formulariopac.html");
            rd.forward(req, resp);    
            }
            
        }
        else if (url.equalsIgnoreCase("/historiaClinica")){
            String fecha= req.getParameter("fecha");
            String nombre = req.getParameter("nombre");
            String cc = req.getParameter("cc");
            String procedencia = req.getParameter("procedencia");
            String ocupacion = req.getParameter("ocupacion");
            String motivo = req.getParameter("motivo");
            String enfermedad = req.getParameter("enfermedad");
            String revision = req.getParameter("revision");
            String antecedentes = req.getParameter("antecedentes");
            String analisis = req.getParameter("analisis");
            String plan = req.getParameter("plan");
            PacienteHC phc = new PacienteHC(fecha,nombre,cc,procedencia,ocupacion,motivo,enfermedad,revision,antecedentes,analisis,plan);
            HistoriaClinica hc = new HistoriaClinica();
            hc.getPacienteshc().add(phc);
            hc.setCedula(cc);
            facade.Addhistoria(hc);
       
            Usuario user = facade.getUsuarios().get(cc);
            req.setAttribute("cc", cc);
            rd = req.getRequestDispatcher("/homeMedico.jsp");
            rd.forward(req, resp);  
        }
        
            else if(url.equalsIgnoreCase("/buscarHistoria")){
            String codigo = req.getParameter("cc");
            facade.verHistoriaPaciente(codigo);
            ServletOutputStream out = resp.getOutputStream();
            out.write(facade.verHistoriaPaciente(codigo).getBytes());
            out.flush();
            out.close();
        
        }
        
        
            else if (url.equalsIgnoreCase("/vertodash")) {
            ServletOutputStream out = resp.getOutputStream();
            out.write(facade.Verhistoriat().getBytes());
            out.flush();
            out.close();

        }
 
    }
    }
