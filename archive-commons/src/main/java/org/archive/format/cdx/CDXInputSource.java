package org.archive.format.cdx;

import java.io.IOException;

import org.archive.format.gzip.zipnum.ZipNumParams;
import org.archive.util.iterator.CloseableIterator;

public interface CDXInputSource {
	
	public CloseableIterator<String> getCDXIterator(String key, String start, boolean exact, ZipNumParams params) throws IOException;
}
