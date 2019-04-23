import java.util.HashMap;
import java.util.List;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {

//        ProcessBuilder process = new ProcessBuilder();
//        Integer port;
//        if (process.environment().get("PORT") != null) {
//            port = Integer.parseInt(process.environment().get("PORT"));
//        } else {
//            port = 4567;
//        }
//
//        setPort(port);


        staticFileLocation("/public");
        String layout = "templates/layout.vtl";

//        get("/", (request, response) -> {
//            HashMap<String, Object> model = new HashMap<String, Object>();
//            model.put("template", "templates/index.vtl");
//            return new ModelAndView(model, layout);
//        }, new VelocityTemplateEngine());
//
//        get("/stylists", (request, response) -> {
//            HashMap<String, Object> model = new HashMap<>();
//            model.put("stylists", Stylist.all());
//            model.put("template", "templates/stylists.vtl");
//            return new ModelAndView(model, layout);
//        }, new VelocityTemplateEngine());
//
//        post("/stylists", (request, response) -> {
//            HashMap<String, Object> model = new HashMap<String, Object>();
//            String stylistName = request.queryParams("name");
//            Stylist stylist = new Stylist(stylistName);
//            stylist.save();
//            response.redirect("/stylists");
//            return new ModelAndView(model, layout);
//        }, new VelocityTemplateEngine());
//
//        get("/stylists/:id", (request, response) -> {
//            HashMap<String, Object> model = new HashMap<String, Object>();
//            Stylist stylist = Stylist.find(Integer.parseInt(request.params(":id")));
//            model.put("stylist", stylist);
//            model.put("clients", stylist.getClients());
//            model.put("template", "templates/stylist.vtl");
//            return new ModelAndView(model, layout);
//        }, new VelocityTemplateEngine());
//
//        get("/stylists/new", (request, response) -> {
//            HashMap<String, Object> model = new HashMap<>();
//            model.put("template", "templates/stylist-form.vtl");
//            return new ModelAndView(model, layout);
//        }, new VelocityTemplateEngine());
//
//        post("/clients", (request, response) -> {
//            HashMap<String, Object> model = new HashMap<>();
//            String clientName = request.queryParams("clientName");
//            Stylist stylist = Stylist.find(Integer.parseInt(request.queryParams("stylistId")));
//            Client client = new Client(clientName, stylist.getId());
//            client.save();
//            List<Client> clients = stylist.getClients();
//            model.put("stylist", stylist);
//            model.put("clients", clients);
//            response.redirect("/stylists/" + stylist.getId());
//            return new ModelAndView(model, layout);
//        }, new VelocityTemplateEngine());
//
//
//        post("/stylists/delete/:id", (request, response) -> {
//            HashMap<String, Object> model = new HashMap<String, Object>();
//            Stylist stylist = Stylist.find(Integer.parseInt(request.params(":id")));
//            stylist.delete();
//            model.put("stylists", Stylist.all());
//            model.put("template", "templates/stylists.vtl");
//            return new ModelAndView(model, layout);
//        }, new VelocityTemplateEngine());
//
//        post("/delete/client/:id", (request, response) -> {
//            HashMap<String, Object> model = new HashMap<String, Object>();
//            Client client = Client.find(Integer.parseInt(request.params(":id")));
//            int stylistId = client.getStylistId();
//            Stylist stylist = Stylist.find(stylistId);
//            client.delete();
//            response.redirect("/stylists/" + stylistId);
//            return null;
//        });
//
//        post("/stylist/:id/update", (request, response) -> {
//            HashMap<String, Object> model = new HashMap<String, Object>();
//            Stylist stylist = Stylist.find(Integer.parseInt(request.params(":id")));
//            String stylistName = request.queryParams("stylistName");
//            stylist.update(stylistName);
//            List<Client> clients = stylist.getClients();
//            model.put("stylist", stylist);
//            model.put("clients", clients);
//            response.redirect("/stylists/" + stylist.getId());
//            return null;
//        });
//
////        get("/stylists/:id/client/update", (request, response) -> {
////            HashMap<String, Object> model = new HashMap<String, Object>();
////            Client client = Client.find(Integer.parseInt(request.params(":id")));
////            model.put("client", client);
////            model.put("template","templates/update-client.vtl");
////            return new ModelAndView(model, layout);
////        }, new VelocityTemplateEngine());
////
////        post("/update/client/:id", (request, response) -> {
////            HashMap<String, Object> model = new HashMap<String, Object>();
////            String newName = request.queryParams("newName");
////            Client client = Client.find(Integer.parseInt(request.params(":id")));
////            int stylistId = client.getStylistId();
////            Stylist stylist = Stylist.find(client.getId());
////            client.update(newName);
////            response.redirect("/stylist/" + stylistId);
////            return null;
////        });
//
//        get("/clients/:id", (request, response) -> {
//            HashMap<String, Object> model = new HashMap<String, Object>();
//            Client client = Client.find(Integer.parseInt(request.params("id")));
//            Stylist stylist = Stylist.find(client.getStylistId());
//            model.put("client", client);
//            model.put("template", "templates/update-client.vtl");
//            return new ModelAndView(model, layout);
//        }, new VelocityTemplateEngine());
//
//        //for update client
//        post("/clients/:id", (request, response) -> {
//            HashMap<String, Object> model = new HashMap<String, Object>();
//            Client client = Client.find(Integer.parseInt(request.params("id")));
//            Stylist stylist = Stylist.find(client.getStylistId());
//            String newName = request.queryParams("name");
//            client.update(newName);
//            model.put("stylist", stylist);
//            String url = String.format("/stylists/%d", stylist.getId());
//            response.redirect(url);
//            return null;
//        });
    }
}
