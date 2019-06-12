
Git命令行操作


	本地库操作
		初始化
		基本操作
		分支管理
	远程库操作
		？？？
		？？？


初始化 （创建本地库）
	命令：		
	git init    初始化空的仓库  				   
		$ ls -lA
		total 4
		drwxr-xr-x 1 Administrator 197121 0 五月    1 09:47 .git/ 
										     "带.的都是隐藏文件
	
设置签名
	格式 
		用户名：tom
		Email地址：aaa@163.com   不会真的发邮件，可与用户名不同
	作用：区分不同开发人员
	辨析：这里设置签名和登录远程库（代码托管中心）的账号、密码没有任何关系
	命令：
		1.项目级别/仓库级别： 仅在当前本地库范围内有效
				git config user.name 用户名 
				git config user.email 邮箱
"				信息保存位置： ./.git/config			当前路径查找 cd .git/config 
		2.系统用户级别：登录当前操作系统的用户访问
				git config --global user.name 用户名  "带参数是系统用户级别
				git config --global user.email 邮箱
"				信息保存位置： cat ~/.git/config		需要回到系统用户去查找
		3.优先级： 就进原则 项目>系统用户 （都存在时）
					二者都没有是 不允许的

基本操作
	git add
		添加	将工作区 “新建、修改”添加到暂存库
	git status	
		查看	工作区、暂存区状态
	git commit -m "commit message" [file name]
	git commit " 不带参数会自动进入 vim 编辑
		提交	暂存区的内容提交的 本地库

版本
	查看历史版本方式
		1.git log   
			多屏显示控制方式：
				空格	翻页
				b		上翻
				q		退出
		2.git log --pretty=ontline 只显示哈希值 指针 日志信息
		3.git log	--oneline		哈希值（部分） 指针 日志信息
		4.git reflog  快速移动版本

版本前进后台
	本质：
	"查出的结果 本身存在一个	HEAD的指针，用于快速回退	



	1.基于索引值方式操作 "常用
		git reset --hard[索引值]     "head 部分哈希值就可以了
	
	2.^符合  
		git reset --hard head
		一个^ 表示一步
	3.~符号
		git reset --hard head~n 
		n 表示后退n步
	
	注:	"符号式只能回退， 用于找之前版本，之后的版本看不到
		"使用 git reflog 会显示所有版本，没有局限

git help reset  查看文档（非在线）

reset命令的三个参数
	soft	仅在本地库移动指针1
	mixed	
			本地库移动指针
			重置暂存区
	hard
			在本地库移动HEAD指针
			重置暂存区
			重置工作区

删除文件并找回
	前提：删除前，文件存在时提交到本地库
	操作： git reset --hard[指针位置]
	删除操作已经提交到本地库：指针位置指向历史记录
	删除操作尚未提交到本地库：指针位置使用HEAD

比较文件差异
			"以行为单位进行文件管理
	git diff [] 
		将工作区文件和暂存区文件比较
	git diff [本地库历史版本][文件名]
		工作区文件和 本地库历史文件比较
	git diff 
		不带参数 比较当前工作区所有文件

分支   
	在版本控制过程中，使用多条线同时推进多个任务（上线、修复、更新同时）

	好处
		1.多模块一起开发，提供效率
		2.单分支的失败，对其他分支没有影响


" git 初始化好久会有分支
	
	git branch -v 
			查看所有分支
	git branch hot_fix
			创建 hot_fix 分支
	git checkout hot_fix 
			切换 到 hot_fix分支
	合并分支
		第一步：切换到接收修改的分支（被合并，增加新内容）上
				git checkout [被合并分支名]
		第二步：执行merge命令
				git merge [有新内容的分支]
	解决冲突 "有分支就会有冲突
		1.编辑文件，删除特殊符号
		2.修改到满意程度，保存退出
		3.git add [文件名]
		4.git commit -m "日志信息"
			注:此时 commit 一定不能带具体翁家明
		
		冲突表现：
			ffffffffff
			<<<<<<<<<< HEAD			| 当前
			hhhhhhhhhh edit by aaa	| 分支
			==========
			hhhhhhhhhh edit by bbb	| 另一
			>>>>>>>>>> master		| 分支
			jjjjjjjjjj
	