

响应式布局
	 <meta name="viewport" content="width=device-width, initial-scale=1 user-scalable=0;"  charset="utf-8">

				initial-scale=1		页面放大倍数，默认 1 ，  2 为屏幕算双击后的效果
				user-scalable=0;	禁用双击






HTML






CSS

		定义	div.id  -  class="id"	页面可以有多的
				#id     -  id="id"		一个页面只能有一个ID




		字体
				line-height: 100px;  行高  --  设置行的间距
				letter-spacing: 1px;  字体 的间距


		"文本内容溢出隐藏（响应式）："
					height: 63px;
					width: 100%;
					text-overflow: ellipsis;		/*超出以省略号显示*/


					word-break: break-all;
					overflow: hidden;				/*超出隐藏*/
					display: -webkit-box;			/*将对象作为弹性伸缩盒子模型展示*/
					-webkit-box-orient: vertical;	/*设置或检索伸缩盒子对象的排列方式*/
					-webkit-line-clamp: 3;			/*设置限制行数    从第几行开始出现限制       -自带省略号？*/







		div内文字	"居中"



				text-align:center;   居中
				line-height:120px;	  没有实现垂直居中，就附加高度

				font-weight: bold; /*粗体*/


		div 内容
				 overflow: hidden;   防止文字溢出框外

		
		边框	属性：border- 
					width		厚度
					tyle		
					color		颜色
				边框形状：	border-radius:  100px  0     0   100px;
										   左上   右上 右下 左下
								

				border :  宽度  颜色  样式

						left 左边框
						right 右边框
						top 上边框
						bottom 下边框


				
				边框属性：	border-style: solid; border-width: 15px 5px 15px 5px;
				
				外边距		margin ： 上 右 下  左
				内边距		padding 
		
			
		背景色为图片 ：  background: url(../BO/img/半圆背景.png) 

		页面最低端显示：	bottom: 0;




--------div浮动  
					<" 注意：在流浪其中，为满足响应式  屏幕水平的值都要用 % ;  垂直的 只能用 px  (%,无效) ">
		定位
			postion:
			relative	;原位置的左上角 为定点
			absolute	;整个页面的左上角为 定点
			fixed		;以浏览器界面做参照物   （通常的广告）


			<div style="position:absolute; left:300px;   top;50px;    line-height:30px">
			div style="    位置：绝对;     左边：300px;  上面; 50px;   线高度：30px" >

	left:300px;
	top;50px;
	line-height:30px
		


	border-radius:20px;  /*圆角模型*/



 JS



    
            $('?')
                ? 可以是 #id、.class 等

                - toggle(); 触发显示和隐藏
                - hide()        隐藏
                - show()        显示
                - alert()       弹窗
                - attr( , )    替换内容

            JQ中         id为 hide 触发点击，调用方法，使P标签隐藏起来
                $("#hide").click(function(){
                $("p").hide();      隐藏选项
                });
                                        同上
                $("#show").click(function(){
                $("p").show();      显示选项
                });


                $(".DD").attr("id","#collapseB");  使class="DD" 中 id标签的内容 替换 为#collapseB




            onclick   点击触发事件
           
			display:
                -none 隐藏选项
                -block 显示选项

            function add（e）     e可以传值


      


        <body style="background: #EDEDED;" >

        <div onclick="Details('1')" style="height: 100px;width: 200px;background: yellow">	点击显示第一个div	</div>
            <div id=Details1	style="display:block">这里是block</div>
            <div id=Details1_1	style="display:none">这里是none</div>
        <hr>
        <div onclick="Details('2')" style="height: 100px;width: 200px;background:yellow">	点击显示第二个div	</div>
            <div id=Details2	style="display:block">这里是block</div>
            <div id=Details2_1	style="display:none">这里是none</div>

             <script>
				function Details(e){
					if(e==1) {
						$('#Details1').toggle();
						$('#Details1_1').toggle();
					}else if(e==2){
						$('#Details2').toggle();
						$('#Details2_1').show
					}
				}
			</script>
