
Git优势
		大部分 本地完成，不需web
		完整性保证	 
				-> 数据进行 hash运算 -> 保证hash值不变 -> 结果不变
				-》 不管输入数据大小，输出结果长度固定
		尽可能添加数据，不是删除和修改     "串珠式保存
		分支操作非常快捷  （能深入）
		与Linux全面兼容




版本控制 "（主要用于 避免单点故障）
	工程蓝图的设计工程； 方便后续修改

	集中式版本控制工具 CVS、SVN(最多)、VSS...
	（服务器-客户端） 
			缺点：
				1.单点故障 
						服务器损坏（所有历史数据丢失），
						客户端（当前状态）提交数据		->服务器只保留这个
	分布式版本控制工具： git、Mercurial、Darcs...
			直接在本地就能进行版本控制	



Git 结构

			
				"本地库"		历史版本

				"暂存区	"		临时存储

				"工作区"		写代码

	 工作区 git add -> 暂存区 git commit（提交） -> 本地库 
	



Git 和 代码托管中心

		代码托管中心： 用于 维护远程库

	局域网环境下
		GitLab 服务器
	外网环境下
		GitHub
		码云






团队内部协作

							代码托管中心
			-------------->   "远程库"<---------
		    |					  |				|
			|				 <--clone（克隆）	push （加入团队） 
		push(推送)			 |					|远程库是经理创建的
			|				 |					|
		"本地库			   本地库" ----------->|
			经理			内部员							
			

 1.经理 自己创建本地库，发送到代码托管中心（创建远程库，一开始为空）
 2. 本地库 push 到远程库， clone（克隆） 到内部员工自己的本地库
 3.员工本地库 经过push 上传到远程库
 4. 最终 经理 经过拉取的操作  就能实现本地库同步



团队外部协作
						  在线合并				拉取的请求
						 -merge<---- 审核 <----pull request <---
						 |										|
					  |<-|										|		
					  |				代码托管中心				|
			 "主远程库"-----> fork（复制） --------------> 远程库 <-
					|				  						| 	    |
					|									|<--|	   push
					|								  clone		    ^
					|		 							|		    |
	 "本地库 <--- pull --->	 本地库" ----------->	第三方代码-----
		
	1.复制远程库
	2.第三方 拉取、上传 回远程库
	3.远程库 发起pull request，主远程库 审核通过 就merge（在线合并）操作
	4.更新后 主远程库拉取到 内部团队的 本地库

