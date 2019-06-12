

第一次克隆时，都要去配置密匙


公、密钥路径：C:\Users\Administrator\.ssh\id_rsa.pub













gogs中创建新远程库learngit      
 
克隆项目到本地    git clone  xxx.git
	cd 进入
master分支下新建文件
	vi a.txt	内容如下:
	this is a
	date 2019-06-10
提交到远程仓库master分支
	$ git add .
	$ git commit  -m  "标记" a.txt
	$ git push origin master


在master分支上创建并切换新分支develop	   若原分支上有文件为上传，则创建不了 新分支
	git branch develop
	git branch	
	git checkout develop
	
	新建文件b.txt
	this is b
	date 2019-06-11
提交到远程仓库develop分支
	$ git push -u origin develop// 将本地的develop分支推送到远程的develop分支中

    切换master分支(主分支)
    合并develop分支
	$ git checkout master  // 切换到主分支
	$ git merge dev   // 将dev分支合并到master分支
提交到远程仓库master分支
	$ git add .   // 将所有修改添加到暂存区
	$ git commit -m "comment"  // 将暂存区的修改提交到仓库 后面添加上有意义的注视信息
	$ git log  // 查看git的commit信息,每次提交的信息包括注视在内,从最新提交到最久提交
	$ git push origin master    推送到远程库







git branch -v  查看所有分支
git branch XX 创建新分支XX

	在git bash新建文件夹命令是 mkdir+文件夹名。
新建文件有两种方式：
	1，touch+文件名，直接新建一个文件
	2，vi+文件名，新建一个文件并进入编辑状态（如果文件已存在，则直接进入编辑状态）



