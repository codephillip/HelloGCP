package com.example.codephillip.myapplication.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import java.util.logging.Logger;

import javax.inject.Named;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "quotesApi",
        version = "v1",
        resource = "quotes",
        namespace = @ApiNamespace(
                ownerDomain = "backend.myapplication.codephillip.example.com",
                ownerName = "backend.myapplication.codephillip.example.com",
                packagePath = ""
        )
)
public class QuotesEndpoint {

    private static final Logger logger = Logger.getLogger(QuotesEndpoint.class.getName());

    /**
     * This method gets the <code>Quotes</code> object associated with the specified <code>id</code>.
     *
     * @param id The id of the object to be returned.
     * @return The <code>Quotes</code> associated with <code>id</code>.
     */
    @ApiMethod(name = "getQuotes")
    public Quotes getQuotes(@Named("id") Long id) {
        // TODO: Implement this function
        logger.info("Calling getQuotes method");
        return null;
    }

    /**
     * This inserts a new <code>Quotes</code> object.
     *
     * @param quotes The object to be added.
     * @return The object to be added.
     */
    @ApiMethod(name = "insertQuotes")
    public Quotes insertQuotes(Quotes quotes) {
        // TODO: Implement this function
        logger.info("Calling insertQuotes method");
        return quotes;
    }
}