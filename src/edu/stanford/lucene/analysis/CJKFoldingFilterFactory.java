/** @note Copyright (c) 2013 by The Board of Trustees of the Leland Stanford Junior University.
 * All rights reserved.  See {file:LICENSE} for details. **/
package edu.stanford.lucene.analysis;

import java.util.Map;

import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.util.TokenFilterFactory;
import org.apache.lucene.analysis.util.AbstractAnalysisFactory;
import org.apache.lucene.analysis.util.MultiTermAwareComponent;

/**
 * Factory for CJKFoldingFilter
 * @author Naomi Dushay
 *
 */
public class CJKFoldingFilterFactory extends TokenFilterFactory implements MultiTermAwareComponent
{
	public CJKFoldingFilterFactory(Map<String, String> map)
	{
		super(map);
	}

	/**
	 * @see org.apache.lucene.analysis.util.TokenFilterFactory#create(org.apache.lucene.analysis.TokenStream)
	 */
	@Override
	public TokenStream create(TokenStream input)
	{
		return new CJKFoldingFilter(input);
	}

	@Override
	public AbstractAnalysisFactory getMultiTermComponent() {
		return this;
	}
}
