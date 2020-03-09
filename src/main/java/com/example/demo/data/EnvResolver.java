package com.example.demo.data;

//https://help.coding.net/docs/devops/ci/env.html
public class EnvResolver {
    public enum Git {
        GIT_URL("仓库 SSH 协议地址"),
        GIT_REPO_URL("仓库 SSH 地址"),
        GIT_BUILD_REF("构建对应的 Git 修订版本号"),


        GIT_DEPLOY_KEY("代码仓库的部署公钥"),
        GIT_SSH_URL("?协议代码仓库地址"),
        GIT_HTTP_URL("HTTPS 协议代码仓库地址"),
        FETCH_REF_SPECS("git 要检出的 refs"),
        REF("要构建的版本"),
        GIT_COMMIT("当前版本的修订版本号"),
        GIT_TAG("触发构建的 Git 标签"),
        DEPOT_NAME("代码仓库的名称"),
        GIT_AUTHOR_NAME("本版本最新提交作者名称"),
        GIT_AUTHOR_EMAIL("本版本最新提交作者邮箱"),
        GIT_COMMITTER_NAME("本版本最新提交者名称"),
        GIT_COMMITTER_EMAIL("本版本最新提交者名称"),

        GIT_PREVIOUS_COMMIT("前一个构建运行编号的修订版本号"),
        GIT_PREVIOUS_SUCCESSFUL_COMMIT("前一个构建运行成功的修订版本号"),
        GIT_LOCAL_BRANCH("本地分支名称"),
        GIT_BRANCH("触发构建的分支");

        private String mean;

        Git(String mean) {
            this.mean = mean;
        }
    }

    public enum Credentials {
        CREDENTIALS_ID("部署私钥凭据 CredentialsId 用于拉取仓库"),
        DOCKER_REGISTRY_CREDENTIALS_ID("docker 私钥凭据 CredentialsId（等同于 CODING_ARTIFACTS_CREDENTIALS_ID）"),
        CODING_ARTIFACTS_CREDENTIALS_ID("制品库私钥凭据 CredentialsId 用于拉取项目内的制品库");

        public String mean;

        Credentials(String mean) {
            this.mean = mean;
        }
    }


    public enum Build {
        CI_BUILD_NUMBER("构建编号");

        public String mean;

        Build(String mean) {
            this.mean = mean;
        }
    }


    public enum Job {
        JOB_ID("构建计划 id"),
        JOB_NAME("构建计划名称");

        public String mean;
        Job(String mean) {
            this.mean = mean;
        }
    }

    public enum Project {
        PROJECT_ID("项目 ID"),
        PROJECT_NAME("项目地址"),
        PROJECT_WEB_URL("项目网页地址"),
        PROJECT_API_URL("项目后端 api 地址"),
        PROJECT_TOKEN("项目令牌密码用于读取项目"),
        PROJECT_TOKEN_GK("项目令牌用户名");

        public String mean;

        Project(String mean) {
            this.mean = mean;
        }
    }


}
