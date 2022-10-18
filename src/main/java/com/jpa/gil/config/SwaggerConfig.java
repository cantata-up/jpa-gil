package com.jpa.gil.config;

public class SwaggerConfig {
//	@Bean
//	public Docket api() {
//		ParameterBuilder aParameterBuilder = new ParameterBuilder();
//        aParameterBuilder.name("Authorization") //헤더 이름
//                .description("Access Tocken") //설명
//                .modelRef(new ModelRef("string"))
//                .parameterType("header")
//                .required(false)
//                .build();
//
//        List<Parameter> aParameters = new ArrayList<>();
//        aParameters.add(aParameterBuilder.build());
//
//		return new Docket(DocumentationType.SWAGGER_2)
//				.globalOperationParameters(aParameters)
//				.apiInfo(info())
//				.select()
//				.apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))
//				.paths(PathSelectors.any()).build();
//	}
//
//	private ApiInfo info() {
//		return new ApiInfoBuilder()
//				.title("SandBox API")
//				.description("SandBox Service를 위한 <b>CRUD</b>")
//				.license("A305")
//				.version("1.0")
//				.build();
//	}
}