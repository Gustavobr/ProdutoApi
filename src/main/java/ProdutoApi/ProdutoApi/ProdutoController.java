/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProdutoApi.ProdutoApi;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.eclipse.persistence.internal.oxm.MediaType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ProdutoController {
    
    
    @RequestMapping(value="/curso", method = RequestMethod.GET)
    public ResponseEntity<Produto> listar(){
        
        return new ResponseEntity<> (HttpStatus.OK);
    }
   
    @GetMapping(value ="/lista", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public List<Produto> listarProduto()throws RuntimeException, EntityNotFoundException{
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProdutoPU");
        EntityManager        em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT p FROM Produto as p");
            List<Produto> lista = query.getResultList();
            return lista;
            
        }catch(RuntimeException ex){
            //return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        
        
        return null;
        
    }
    

    
    @RequestMapping(value ="/listar/{id_produto}",method = RequestMethod.GET,produces = org.springframework.http.MediaType.APPLICATION_XML_VALUE)
        @ResponseBody
        public String index(){
            
            
            return "";
        }
    
}
