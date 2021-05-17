/**
 * @author Anca Foia
 * @CCAC CIT-111-Z03
 * 05/16/2021
 * 
 * Final project
 * Mail sorting machine
 */

package mailsortingmachine;

import java.util.Random;

/**
 * Boilerplate class for representing a postal envelope
 *  
 */
public class Envelope {

  // class members
  public int id;
  private int postageCount = 0; // number of postages on the envelope
  private String toAddress; // destination address
  private String fromAddress; // sender address
  private String status; // state of the envelope in the system

  /*
    Explicit constructor that create an Envelope objects with postage, to address and from address
  */
  public Envelope(String to, String from, int postage) {
    // Set a random ID
    Random random = new Random();
    id = random.nextInt(999999);

    // Set members
    postageCount = postage;
    toAddress = to;
    fromAddress = from;
    status = "Not processed";
  }

  // Getters
  public int getPostageCount() {
    return postageCount;
  }

  public String getToAddress() {
    return toAddress;
  }

  public String getFromAddress() {
    return fromAddress;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
