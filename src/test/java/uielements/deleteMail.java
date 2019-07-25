package uielements;

import java.util.Properties;

import javax.mail.FetchProfile;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;
import javax.swing.JOptionPane;

/**
 * This program demonstrates how to remove e-mail messages on a mail server
 * using JavaMail API.
 * 
 * @author www.codejava.net
 *
 */
public class deleteMail {

	/**
	 * Deletes all e-mail messages whose subject field contain a string specified by
	 * 'subjectToDelete'
	 * 
	 * @param host
	 * @param port
	 * @param userName
	 * @param password
	 * @param subjectToDelete
	 *            delete if the message's subject contains this value.
	 */
	public static Message[] arrayMessages = null;
	public void deleteMessages(String host, String port, String userName, String password, String subjectToDelete) {
		Properties properties = new Properties();

		// server setting
		properties.put("mail.imap.host", host);
		properties.put("mail.imap.port", port);

		// SSL setting
		properties.setProperty("mail.imap.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		properties.setProperty("mail.imap.socketFactory.fallback", "false");
		properties.setProperty("mail.imap.socketFactory.port", String.valueOf(port));

		Session session = Session.getDefaultInstance(properties);

		try {
			// connects to the message store
			Store store = session.getStore("imap");
			store.connect(userName, password);


			// opens the inbox folder
			Folder folderInbox = store.getFolder("INBOX");
			folderInbox.open(Folder.READ_WRITE);
			arrayMessages = null;
			// fetches new messages from server
			arrayMessages = folderInbox.getMessages();

			for (int i = 0; i < arrayMessages.length; i++) {
				Message message = arrayMessages[i];
				String subject = message.getSubject();
				if (subject.contains(subjectToDelete)) {
					message.setFlag(Flags.Flag.DELETED, true);
					System.out.println("Marked DELETE for message: " + subject);
				}

			}

			// expunges the folder to remove messages which are marked deleted
			boolean expunge = true;
			folderInbox.close(expunge);

			// another way:
			// folderInbox.expunge();
			// folderInbox.close(false);

			// disconnect
			store.close();
		} catch (NoSuchProviderException ex) {
			System.out.println("No provider.");
			ex.printStackTrace();
		} catch (MessagingException ex) {
			System.out.println("Could not connect to the message store.");
			ex.printStackTrace();
		}
	}

	

	
	
	

	/**
	 * Runs this program to delete e-mail messages on a Gmail account via IMAP
	 * protocol.
	 * 
	 * @throws MessagingException
	 */
	public static void delete() throws MessagingException {
		try {
		System.out.print("entered---------------------------");

		String host = "imap.gmail.com";
		String port = "993";
		String userName = "mprotest4@gmail.com";
		String password = "qwerty@123";
		deleteMail remover = new deleteMail();

		// try to delete all messages contain this string its Subject field
		String subjectToDelete0 = "Pre Issuance Verification Link";
		remover.deleteMessages(host, port, userName, password, subjectToDelete0);

		String subjectToDelete1 = "Max Life Insurance eProposal Form";
		remover.deleteMessages(host, port, userName, password, subjectToDelete1);

		String subjectToDelete2 = "Max Life Insurance Benefit Illustration Pdf";
		remover.deleteMessages(host, port, userName, password, subjectToDelete2);

		String subjectToDelete3 = "Pre Issuance otp confirmation";
		remover.deleteMessages(host, port, userName, password, subjectToDelete3);

		String subjectToDelete4 = "Acknowledgment of completion of Pre Issuance Verification Process";
		remover.deleteMessages(host, port, userName, password, subjectToDelete4);

			remover.refresh();
		} catch (Exception e) {
			throw e;
		}
	}

	protected static Session session;
	private static Store store;
	private static Folder folder;
	private static Message[] messages;
	private static Properties properties;

	public static Message[] readAllMessages() {

		if (properties == null) {
			return null;
		}
		try {

			String host = "imap.gmail.com";
			String userName = "mprotest4@gmail.com";
			String password = "qwerty@123";
			store.connect(properties.getProperty(host), userName, password);
		} catch (MessagingException ex) {
			JOptionPane.showMessageDialog(null,
					" couldn't connect to mail server ,please make sure you entered to right(username,password). Or make sure of your mail client connect configuration under props/config.properties file.",
					"Mail client Error", JOptionPane.ERROR_MESSAGE);

		}
		try {

			folder = store.getDefaultFolder();
			folder = folder.getFolder("INBOX");
			folder.open(Folder.READ_ONLY);
			Message[] newmessages = folder.getMessages();
			FetchProfile fp = new FetchProfile();
			fp.add(FetchProfile.Item.ENVELOPE);
			folder.fetch(newmessages, fp);
			messages = newmessages;
			return messages;
		} catch (MessagingException ex) {
			JOptionPane.showMessageDialog(null, "Reading the messages INBOX failed -" + ex, "Mail client Error",
					JOptionPane.ERROR_MESSAGE);
		}

		return messages;

	}

	public static void refresh() {
		readAllMessages();
	}

}