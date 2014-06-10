package controllers;



import static play.data.Form.form;
import play.*;
import play.data.*;
import play.data.validation.Constraints.Max;
import play.data.validation.Constraints.Min;
import play.data.validation.Constraints.Required;
import play.mvc.*;
import views.html.*;
import java.lang.*;


public class Application extends Controller {
	
	public static class Equation {
        @Required public double a;
        @Required public double b;
        @Required public double c;

    } 
	 
    public static Result index() {
        return ok(
            index.render(form(Equation.class))
        );
    }
	
    
    public static Result calculate() {
       Form<Equation> form = form(Equation.class).bindFromRequest();
        if(form.hasErrors()) {
            return badRequest(index.render(form));
        } else {
        	Calculator c= new Calculator();
        	Equation d = form.get();
        	
        	//the equation can not take the values of form
	        	c. calculate(d);
	        	
           return ok(
                result.render(s.get_x1(),s.get_x2())
            );
        }
    }
    
}
