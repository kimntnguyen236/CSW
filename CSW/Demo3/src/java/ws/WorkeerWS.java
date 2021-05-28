/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import bean.WorkerSBLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.Worker;

/**
 *
 * @author lenovo
 */
@WebService(serviceName = "WorkeerWS")
public class WorkeerWS {

    @EJB
    private WorkerSBLocal workerSB;

 
    @WebMethod(operationName = "findAll")
    public List<Worker>findAll() {
        return workerSB.findAll();
    }
    @WebMethod(operationName = "addWorker")
    public void addWorker(@WebParam(name = "worker") Worker worker) {
       workerSB.addWorker(worker);
    }
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
}
