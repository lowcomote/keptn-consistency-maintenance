/*
 * generated by Xtext 2.25.0
 */
package eu.lowcomote.keptn.sli.formatting2

import com.google.inject.Inject
import eu.lowcomote.keptn.sli.ServiceLevelIndicators
import eu.lowcomote.keptn.sli.SliRoot
import eu.lowcomote.keptn.sli.services.SliGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class SliFormatter extends AbstractFormatter2 {
	
	@Inject extension SliGrammarAccess

	def dispatch void format(SliRoot sliRoot, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		sliRoot.sliRoot.format
	}

	def dispatch void format(ServiceLevelIndicators serviceLevelIndicators, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (serviceLevelIndicatorsPropertiesAbstract : serviceLevelIndicators.serviceLevelIndicators) {
			serviceLevelIndicatorsPropertiesAbstract.format
		}
	}
	
	// TODO: implement for ServiceLevelIndicatorsIndicators
}
