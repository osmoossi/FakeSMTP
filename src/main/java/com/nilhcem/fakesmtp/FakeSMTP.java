package com.nilhcem.fakesmtp;

import org.apache.commons.cli.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nilhcem.fakesmtp.core.ArgsHandler;
import com.nilhcem.fakesmtp.server.SMTPServerHandler;

import java.net.InetAddress;

/**
 * Entry point of the application.
 *
 * @author Nilhcem
 * @since 1.0
 */
public final class FakeSMTP {
	private static final Logger LOGGER = LoggerFactory.getLogger(FakeSMTP.class);

	private FakeSMTP() {
		throw new UnsupportedOperationException();
	}
	
	public static void main(final String[] args) {
		
		LOGGER.info("Starting up");
        try {
			ArgsHandler.INSTANCE.handleArgs(args);
		} catch (ParseException e) {
			ArgsHandler.INSTANCE.displayUsage();
			return;
		}

		try {
			SMTPServerHandler.INSTANCE.startServer(getPort(), InetAddress.getLocalHost());
		} catch (NumberFormatException e) {
			LOGGER.error("Error: Invalid port number", e);
		} catch (Exception e) {
			LOGGER.error("Failed to auto-start server in background", e);
		}
	}
	
	private static int getPort() throws NumberFormatException {
		String portStr = ArgsHandler.INSTANCE.getPort();
		return Integer.parseInt(portStr);
	}
}
