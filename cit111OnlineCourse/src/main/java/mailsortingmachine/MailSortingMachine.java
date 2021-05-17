/**
 * @author Anca Foia
 * @CCAC CIT-111-Z03
 * 05/16/2021
 * 
 * Final project
 * Mail sorting machine
 */

package mailsortingmachine;

class MailSortingMachine {
  private int failedEntries = 0;
  private int successEntries = 0;

  // Checks if an envelope has at least one postage and 
  private boolean checkPostage(Envelope e) {

    // If envelope has no postage return it to sender
    if (e.getPostageCount() == 0) {
      System.out.println("INFO: Missing postage on envelope with id: " + e.id);
      return false;
    }

    System.out.println("Reading stamp... Invalidating stamp... Applying QR code...");
    e.setStatus("Postage is valid");
    return true;
  }

  private boolean checkSenderAddress(Envelope e) {
    if (e.getFromAddress() == "") {
      System.out.println("INFO: Missing sender address on envelope with id: " + e.id);
      return false;
    }

    System.out.println("INFO: Sender address checked.");
    e.setStatus("Sender address checked");
    return true;
  }

  private boolean checkDestinationAddress(Envelope e) {
    if (e.getToAddress() == "") {
      System.out.println("INFO: Missing destination address on envelope with id: " + e.id);
      return false;
    }

    e.setStatus("Destination address checked");
    System.out.println("INFO: Destination address checked.");
    return true;
  }

  // Return an evelope to sender
  private void returnToSender(Envelope e) {
    System.out.println("Returning to sender at " + e.getFromAddress());
    e.setStatus("Return to sender");
  }

  // Destroy an envelope
  private void destroyEnvelope(Envelope e) {
    System.out.println("Destroying envelope with id " + e.id);
    e.setStatus("Destroyed");
  }

  /**
   * Process an array of envelopes
   * @param envelopes Array of envelopes to be processed
   */
  public void processEnvelopes(Envelope[] envelopes) {
    for (int i = 0; i < envelopes.length; i++) {
      Envelope e = envelopes[i];
      System.out.println("\nProcessing envelope with id " + e.id + "...");

      boolean validPostage = checkPostage(e);
      boolean validSender = checkSenderAddress(e);
      boolean validDestination = checkDestinationAddress(e);

      // If postage and sender address are missing, destroy the envelope
      if (!validPostage && !validSender) {
        destroyEnvelope(e);
        failedEntries++;
        continue;
      }

      if ((!validPostage || !validDestination) && validSender) {
        returnToSender(e);
        failedEntries++;
        continue;
      }

      if (validPostage && validDestination) {
        System.out.println("In transit to destination at " + e.getToAddress());
        e.setStatus("In transit to");
        successEntries++;
      }
    }

    System.out.println("\n\nFinal report:");
    System.out.println(envelopes.length + " envelopes processed.");
    System.out.println("Success entries: " + successEntries);
    System.out.println("Failed entries: " + failedEntries);
  }
}