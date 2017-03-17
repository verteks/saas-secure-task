package controllers;

import models.*;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

	// Главная страница
    public static Result index() {
        return ok(index.render());
    }
    
    // Несуществующий путь
    public static Result error(String path) {
    	return ok(err.render(path));
    }
}
