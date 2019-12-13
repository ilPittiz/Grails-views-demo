package rootviews

class UrlMappings {

    static mappings = {

		name 'controllerHtml': 	'/controller.html' (controller: 'main') { _view = 'html' }
		name 'rootHtml': 		'/root.html' (controller: 'main') { _view = '/html' }
		name 'controllerJson': 	'/controller.json' (controller: 'main') { _view = 'json' }
		name 'rootJson': 		'/root.json' (controller: 'main') { _view = '/json' }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
