package org.rapidpm.microservice.filestoredemo.api;

/**
 * Created by b.bosch on 13.10.2015.
 */
public class FileStoreServiceMessage {
    public byte[] fileContend;
    public String fileName;
    public FileStoreAction action;
}