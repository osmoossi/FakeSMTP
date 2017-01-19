package com.nilhcem.fakesmtp.server;

import java.io.IOException;
import java.io.InputStream;
import org.subethamail.smtp.helper.SimpleMessageListener;

/**
 * Listens to incoming emails and redirects them to the {@code MailSaver} object.
 *
 * @author Nilhcem
 * @author osmoossi
 * @since 1.0
 */
public final class MailListener implements SimpleMessageListener {
	private final MailLogger logger;
	
	MailListener(MailLogger logger) {
		this.logger = logger;
	}
	
	public boolean accept(String from, String recipient) {
		return true;
	}
	
	@Override
	public void deliver(String from, String recipient, InputStream data) throws IOException {
		logger.logEmail(from, recipient, data);
	}
}
