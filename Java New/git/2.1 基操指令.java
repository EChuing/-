
初始化  （就是创建 .git 目录）
	git init

设置签名
	$ git config user.name tom
	$ git config user.email aaa@163.com



查看签名
	$ cat .git/config
	[core]
		repositoryformatversion = 0
		filemode = false
		bare = false
		logallrefupdates = true
		symlinks = false
		ignorecase = true
	[user]
		name = tom
		email = aaa@163.com


编辑创建good.txt
	$ vim good       i 输入   Esc ：wq 保存退出

查看工作区、暂存区
	$ git status
	On branch master

	No commits yet

	Changes to be committed:
	  (use "git rm --cached <file>..." to unstage)

		good.txt "红色

	$ git status
	On branch master
	Changes to be committed:
	  (use "git reset HEAD <file>..." to unstage)

		new file:   sf.txt " 绿色



提交到本地库
	$ git commit good.txt
	（自动进入VIM页面？？？）
	苏菲！ 你指的拥有... "后续屏幕显示
	# Please enter the commit message for your changes. Lines starting
	# with '#' will be ignored, and an empty message aborts the commit.
	#
	# On branch master
	# Changes to be committed:
	#       new file:   good.txt
	#
	~
	~
	 ：wq

	$ git commit sf.txt
	warning: LF will be replaced by CRLF in sf.txt.
	The file will have its original line endings in your working directory
	[master dc54c87] 苏菲！ 你指的拥有...
	 1 file changed, 5 insertions(+)
	 create mode 100644 sf.txt

或者 -m 指定 （省去进入VIM 编辑操作）
	$ git commit -m "Hello Word !" good.txt
	warning: LF will be replaced by CRLF in good.txt.
	The file will have its original line endings in your working directory
	[master dff0662] Hello Word !
	 1 file changed, 2 insertions(+)


查看状态
	$ git status
	On branch master
	nothing to commit, working tree clean   "没东西要提交，目录是干净的




查看版本历史记录
	默认是一般格式
	$ git log （必须设置签名 + 编辑vim提交到 本地库）
		commit dc54c87c3e70825f868f83dee6e229a145e9c73f (HEAD -> master)
		Author: tom <aaa@163.com>
		Date:   Wed May 1 22:26:29 2019 +0800

			苏菲！ 你指的拥有...

		commit dff06620a841c88d29c292866ee8acc8ed05fb06
		Author: tom <aaa@163.com>
		Date:   Wed May 1 22:02:51 2019 +0800

			Hello Word !

	简洁方式显示
	$ git log --pretty=oneline 
	"			哈希值							  指针		      日志信息
	dc54c87c3e70825f868f83dee6e229a145e9c73f (HEAD -> master) 苏菲！ 你指的拥有...
	dff06620a841c88d29c292866ee8acc8ed05fb06 Hello Word !
	19ed5f94cb692f33ce42ce16d9e0f681be6ad8e5 My furst cinnut,bew fuke giid.txt

	显示一部分的哈希值
	$ git log --oneline
	dc54c87 (HEAD -> master) 苏菲！ 你指的拥有...
	dff0662 Hello Word !
	19ed5f9 My furst cinnut,bew fuke giid.txt
	
	$ git reflog  "HEAD@{移动到当前版本需要的步数}: 
	dc54c87 (HEAD -> master) HEAD@{0}: commit: 苏菲！ 你指的拥有...
	dff0662 HEAD@{1}: commit: Hello Word !
	19ed5f9 HEAD@{2}: commit (initial): My furst cinnut,bew fuke giid.txt
