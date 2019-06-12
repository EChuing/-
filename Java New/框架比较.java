'SpringMVC 和  Struts2

	共同
		都表现层，基于MVC模型编写
		底层都离不开原始得Servlet
		处理请求机制都是 一个核心控制器

	区别
		SpringMVC 入口是Servlet ，Struts2 是 Filter
				 基于方法设计  ，         基于类， struts2每次执行都会创建一个动作类。（ SpringMVC 运行会稍微 快）
		SpringMVC 更简洁，还支持 JSR303 ,处理AJAX 的请求方便

		'JSR303'  一套基于JavaBean 参数校验的标准，本身就定义了很多常用的校验注解，可直接加载 JavaBean属性上，可在需要时使用
		
		struts2 的OGNL 表达式页面的开发效率相比 SpringMVC 更高，但执行效率并没有比JSTL提升，尤其是struts2的表单标签，远没有html执行效率高





























