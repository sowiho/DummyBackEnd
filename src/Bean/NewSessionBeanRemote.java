/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import ferry.contract.AdminContract;
import javax.ejb.Remote;

/**
 *
 * @author Soren
 */
@Remote
public interface NewSessionBeanRemote {
     public AdminContract getManager();
}
