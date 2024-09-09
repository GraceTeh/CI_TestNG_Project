job(&#39;Python-Build-Job&#39;) {
description(&#39;A Jenkins job to build Python projects.&#39;)
// Source Code Management
scm {
git(&#39;https://github.com/GraceTeh/CI1.git&#39;)
}
// Build Triggers
triggers {
scm(&#39;H/15 * * * *&#39;) // Poll SCM every 15 minutes
}
// Build Steps
steps {
shell(&#39;pip install -r requirements.txt&#39;) // Install
dependencies
shell(&#39;pytest&#39;) // Run tests
}
// Post-build Actions
publishers {
archiveArtifacts(&#39;**/target/*.zip&#39;)

20

}
}
