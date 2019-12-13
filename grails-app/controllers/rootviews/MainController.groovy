package rootviews

class MainController {

    def index() {
		String view = params._view
		render view: view, model: [ map: [ view: view, uri: request.forwardURI ] ]
	}

}
