package eu.lowcomote.keptn.fixes

import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.core.commands.IHandler
import org.eclipse.core.commands.IHandlerListener
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.edit.domain.IEditingDomainProvider
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.handlers.HandlerUtil

class ModelRepairsCommandHandler implements IHandler {

	SliSloModelRepairs modelRepairs

	override void addHandlerListener(IHandlerListener handlerListener) {
	}

	override void dispose() {
		modelRepairs.close
	}

	override Object execute(ExecutionEvent event) throws ExecutionException {
		var IEditorPart editorPart = HandlerUtil.getActiveEditor(event)
		var ResourceSet resourceSet = ((editorPart as IEditingDomainProvider)).editingDomain.resourceSet
		modelRepairs = new SliSloModelRepairs(resourceSet)
		modelRepairs.execute
		return null
	}

	override boolean isEnabled() {
		return true
	}

	override boolean isHandled() {
		return false
	}

	override void removeHandlerListener(IHandlerListener handlerListener) {
	}
}
