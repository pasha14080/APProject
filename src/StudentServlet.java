

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	static int i=0;
    static final long serialVersionUID = 100000L;
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // read form fields
        String email=request.getParameter("email");
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String mobile= request.getParameter("mobile");
        String phdstream=request.getParameter("phdstream");
        String phdpref1= "";
        switch(Integer.parseInt(request.getParameter("phdpref1"))) {
            case 1: phdpref1= "None";
                    break;
            case 2: phdpref1 = "BioPhysics -CB";
                    break;
            case 3: phdpref1 = "Structural Biology -CB";
                    break;
            case 4: phdpref1 = "Systems Biology -CB";
                    break;
           
        }
        String phdpref2= "";
        switch(Integer.parseInt(request.getParameter("phdpref2"))) {
            case 1: phdpref2 = "None";
                    break;
            case 2: phdpref2 = "BioPhysics -CB";
                    break;
            case 3: phdpref2 = "Structural Biology -CB";
                    break;
            case 4: phdpref2 = "Systems Biology -CB";
                    break;
           
        }
        String phdpref3= "";
        switch(Integer.parseInt(request.getParameter("phdpref3"))) {
            case 1: phdpref3 = "None";
                    break;
            case 2: phdpref3 = "BioPhysics -CB";
                    break;
            case 3: phdpref3 = "Structural Biology -CB";
                    break;
            case 4: phdpref3 = "Systems Biology -CB";
                    break;
           
        }
        String gender=request.getParameter("gender");
        String category=request.getParameter("category");
        String pdisable= request.getParameter("pdisable");
        String dob= request.getParameter("dob");
        //System.out.println(dob+mobile);
        String war=request.getParameter("war");
        String father = request.getParameter("father");
        String nation= request.getParameter("nation");
        String paddress=request.getParameter("paddress");
        String pin = request.getParameter("pin");
        String xboard=request.getParameter("xboard");
        String xmarks=request.getParameter("xmarks");
        String xyear =request.getParameter("xyear");
        String xiiboard =request.getParameter("xiiboard");
        String xiimarks = request.getParameter("xiimarks");
        String xiiyear = request.getParameter("xiiyear");
        String gidegree=request.getParameter("gidegree");
        String gidepart = request.getParameter("gidepart");
        String gicollege = request.getParameter("gicollege");
        String giuni = request.getParameter("giuni"); 
    	String gicity = request.getParameter("gicity");
    	String gistate = request.getParameter("gistate");
    	switch(Integer.parseInt(request.getParameter("gistate"))) {
            case 1: gistate = "None";
                    break;
            case 2: gistate = "Andhra Pradesh";
                    break;
            case 3: gistate = "Arunachal Pradesh";
                    break;
            case 4: gistate = "Assam";
                    break;
            case 5: gistate = "Bihar";
                    break;
            case 6: gistate = "Chattisgarh";
                    break;
            case 7: gistate = "Delhi";
                    break;
            case 8: gistate = "Goa";
                    break;
            case 9: gistate = "Gujarat";
                    break;
            case 10: gistate = "Haryana";
                     break;
            case 11: gistate = "Himachal Pradesh";
                     break;
            case 12: gistate = "Jammu and Kashmir";
                     break;
            case 13: gistate = "Jharkhand";
                     break;
            case 14: gistate = "Karnataka";
                     break;
            case 15: gistate = "Kerala";
                     break;
            case 16: gistate = "Madhya Pradesh";
                     break;
            case 17: gistate = "Maharashtra";
                     break;
            case 18: gistate = "Manipur";
                     break;
            case 19: gistate = "Meghalaya";
                     break;
            case 20: gistate = "Mizoram";
                     break;
            case 21: gistate = "Nagaland";
                     break;
            case 22: gistate = "Odisha";
                     break;
            case 23: gistate = "Rajasthan";
                     break;
            case 24: gistate = "Sikkim";
                     break;
            case 25: gistate = "Tamil Nadu";
                     break;
            case 26: gistate = "Telangana";
                     break;
            case 27: gistate = "Tripura";
                     break;
            case 28: gistate = "Uttar Pradesh";
                     break;
            case 29: gistate = "Uttarakhand";
                     break;
            case 30: gistate = "West Bengal";
                     break;             
        }
    	String cgpa = request.getParameter("cgpa");
    	cgpa="CGPA";
        String cgpa1="";
        String cgpa2="";
        if(cgpa.equals("CGPA") && cgpa!=null)
        {
             cgpa1=request.getParameter("cgpa1");
            cgpa2=request.getParameter("cgpa2");
        }
       if(cgpa.equals("MARKS"))
        {
           String gimarks=request.getParameter("gimarks");
        }
        String check1=request.getParameter("check1");
        String check11="";
        String check12="";
        String check13="";
        String check14="";
        if(check1!=null)
        {
             check11=request.getParameter("check11");
             check12=request.getParameter("check12");
             check13=request.getParameter("check13");
             check14=request.getParameter("check14");
        }
        else
        {
             check11="";
             check12="";
             check13="";
             check14="" ;  
        }
        String check2=request.getParameter("check2");
               String pgicollege="";
            String pgicity="";
            String pgistate="";
            String pgidepart="";
            String pgidegree="";
            String pgititle="";
            String pgiyear="";
            String pcgpa="";
            String pcgpa1="";
            String pcgpa2="";
            String pgimarks="";
        if(check2!=null)
        {
             pgicollege=request.getParameter("pgicollege");
             pgicity =request.getParameter("pgicity");
             pgistate=request.getParameter("pgistate");
            switch(Integer.parseInt(request.getParameter("pgistate"))) {
            case 1: pgistate = "None";
                    break;
            case 2: pgistate = "Andhra Pradesh";
                    break;
            case 3: pgistate = "Arunachal Pradesh";
                    break;
            case 4: pgistate = "Assam";
                    break;
            case 5: pgistate = "Bihar";
                    break;
            case 6: pgistate = "Chattisgarh";
                    break;
            case 7: pgistate = "Delhi";
                    break;
            case 8: pgistate = "Goa";
                    break;
            case 9: pgistate = "Gujarat";
                    break;
            case 10: pgistate = "Haryana";
                     break;
            case 11: pgistate = "Himachal Pradesh";
                     break;
            case 12: pgistate = "Jammu and Kashmir";
                     break;
            case 13: pgistate = "Jharkhand";
                     break;
            case 14: pgistate = "Karnataka";
                     break;
            case 15: pgistate = "Kerala";
                     break;
            case 16: pgistate = "Madhya Pradesh";
                     break;
            case 17: pgistate = "Maharashtra";
                     break;
            case 18: pgistate = "Manipur";
                     break;
            case 19: pgistate = "Meghalaya";
                     break;
            case 20: pgistate = "Mizoram";
                     break;
            case 21: pgistate = "Nagaland";
                     break;
            case 22: pgistate = "Odisha";
                     break;
            case 23: pgistate = "Rajasthan";
                     break;
            case 24: pgistate = "Sikkim";
                     break;
            case 25: pgistate = "Tamil Nadu";
                     break;
            case 26: pgistate = "Telangana";
                     break;
            case 27: pgistate = "Tripura";
                     break;
            case 28: pgistate = "Uttar Pradesh";
                     break;
            case 29: pgistate = "Uttarakhand";
                     break;
            case 30: pgistate = "West Bengal";
                     break;            
            }
             pgidepart=request.getParameter("pgidepart");
             pgidegree=request.getParameter("pgidegree");
             pgititle=request.getParameter("pgititle");
             pgiyear=request.getParameter("pgiyear");
              pcgpa = request.getParameter("pcgpa");
              System.out.println(pcgpa);
            if(pcgpa.equals("CGPA"))
            {
                 pcgpa1=request.getParameter("pcgpa1");
                 pcgpa2=request.getParameter("pcgpa2");
            }
            if(cgpa.equals("MARKS"))
            {
                 pgimarks=request.getParameter("pgimarks");
            }     
        }   
        else
        {
             pgicollege="";
             pgicity="";
             pgistate="";
             pgidepart="";
             pgidegree="";
             pgititle="";
             pgiyear="";
             pcgpa="";
             pcgpa1="";
             pcgpa2="";
             pgimarks="";
        }
        String check3=request.getParameter("check3");
        String oadname="";
            String oadsubject="";
            String oadyear="";
            String oadscore="";
            String oadrank="";
        if(check3!=null)
        {
             oadname=request.getParameter("oadname");
             oadsubject=request.getParameter("oadsubject");
             oadyear=request.getParameter("oadyear");
             oadscore=request.getParameter("oadscore");
             oadrank=request.getParameter("oadrank");
        }
        else
        {
             oadname="";
             oadsubject="";
             oadyear="";
             oadscore="";
             oadrank="";      
        }
        String check4=request.getParameter("check4");
       
            String gaterank="";
            String gatemarks="";
            String gatescore="";
            String gateyear="";
            String gatearea="";
        if(check4!=null)
        {
             gatearea=request.getParameter("gatearea");
             gateyear=request.getParameter("gateyear");
              gatescore=request.getParameter("gatescore");
              gatemarks=request.getParameter("gatemarks");
              gaterank=request.getParameter("gaterank");      
        }
        else {
             gaterank="";
             gatemarks="";
             gatescore="";
             gateyear="";
             gatearea="";
        }
        String data="";
        data=data+email+"\n"+name+"\n"+address+"\n"+mobile+"\n"+phdstream+"\n"+phdpref1+"\n"+phdpref2+"\n"+phdpref3+"\n"+gender+"\n"+category+"\n"+pdisable+"\n"+dob+"\n"+war+"\n"+father+"\n"+nation+"\n"+paddress+"\n"+pin+"\n"+xboard+"\n"+xmarks+"\n"+xyear+"\n"+xiiboard+"\n"+xiimarks+"\n"+xiiyear+"\n"+gidegree+"\n"+gidepart+"\n"+gicollege+"\n"+giuni+"\n"+gicity+"\n"+gistate+"\n"+cgpa+":"+cgpa1+"/"+cgpa2+"\n"+check11+"\n"+check12+"\n"+check13+"\n"+check14+"\n"+pgicollege+"\n"+pgicity+"\n"+pgistate+"\n"+pgidepart+"\n"+pgidegree+"\n"+pgititle+"\n"+pgiyear+"\n"+pcgpa+":"+pcgpa1+"/"+pcgpa2+"\n"+oadname+"\n"+oadsubject+"\n"+oadyear+"\n"+oadscore+"\n"+oadrank+"\n"+gatearea+"\n"+gateyear+"\n"+gatescore+"\n"+gatemarks+"\n"+gaterank+"\n";
        Writer writer=null;
        try {
            //Whatever the file path is.
            File statText = new File("E:/"+i+".txt");
            i++;
            FileOutputStream is = new FileOutputStream(statText);
            OutputStreamWriter osw = new OutputStreamWriter(is);    
            Writer w = new BufferedWriter(osw);
            w.write(data);
            w.close();
            System.out.println("pulkit");
        } catch (IOException e) {
            System.err.println("Problem writing to the file statsTest.txt");
        }
    }
}