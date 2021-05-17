/**
 * @author Anca Foia
 * @CCAC CIT-111-Z03
 * 05/16/2021
 * 
 * Final project
 * Mail sorting machine
 */

package mailsortingmachine;

public class PostalOffice {

  public static void main(String[] args) {

    // Create an instance of the MailSortingMachine
    MailSortingMachine machine = new MailSortingMachine();

    // Create an array of envelopes
    final Envelope[] envelopes = new Envelope[4];

    // Create envelope with missing postage
    envelopes[0] = new Envelope("8701 Perry Hwy, Pittsburgh, PA 15237", "2003 Wolf Drive, 15213", 0);

    // Create a valid envelope
    envelopes[1] = new Envelope("8701 Perry Hwy, Pittsburgh, PA 15237", "2003 Wolf Drive, 15213", 1);

    // Create envelope with missing destination
    envelopes[2] = new Envelope("", "2003 Wolf Drive, 15213", 1);

    // Create envelope with missing postage and sender
    envelopes[3] = new Envelope("", "", 0);

    machine.processEnvelopes(envelopes);
  }

}
