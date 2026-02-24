/**
 * AzureAgent: Introduces Azure as an agent for resource deployment.
 * AzureAgent：将 Azure 作为 agent，介绍资源部署的基本流程。
 */
public class AzureAgent {

    /**
     * Prints an introduction to Azure resource deployment concepts and workflow.
     * 输出 Azure 资源部署的概念与基本工作流介绍。
     */
    public static void introduce() {
        System.out.println("=== Azure Resource Deployment Agent / Azure 资源部署 Agent ===");
        System.out.println();

        System.out.println("Azure is Microsoft's cloud computing platform that enables you to build,");
        System.out.println("deploy, and manage applications and infrastructure at scale.");
        System.out.println("Azure 是微软的云计算平台，可用于大规模构建、部署和管理应用程序及基础设施。");
        System.out.println();

        System.out.println("--- Key Azure Resource Types / 主要 Azure 资源类型 ---");
        System.out.println("1. Resource Groups (资源组)       - Logical containers for Azure resources");
        System.out.println("2. Virtual Machines (虚拟机)      - Scalable compute in the cloud");
        System.out.println("3. Storage Accounts (存储账户)    - Blob, file, queue and table storage");
        System.out.println("4. Virtual Networks (虚拟网络)    - Isolated network environments");
        System.out.println("5. Azure App Service (应用服务)   - Host web apps, REST APIs, mobile backends");
        System.out.println("6. Azure SQL Database (SQL 数据库)- Fully managed relational database");
        System.out.println();

        System.out.println("--- Azure SDK for Java: Resource Deployment Workflow");
        System.out.println("--- Azure Java SDK：资源部署工作流 ---");
        System.out.println();

        System.out.println("Step 1 / 步骤一: Authenticate with DefaultAzureCredential");
        System.out.println("  TokenCredential credential = new DefaultAzureCredentialBuilder().build();");
        System.out.println();

        System.out.println("Step 2 / 步骤二: Create an AzureProfile with subscription info");
        System.out.println("  AzureProfile profile = new AzureProfile(tenantId, subscriptionId, AzureEnvironment.AZURE);");
        System.out.println();

        System.out.println("Step 3 / 步骤三: Authenticate and get an AzureResourceManager client");
        System.out.println("  AzureResourceManager azure = AzureResourceManager");
        System.out.println("      .authenticate(credential, profile)");
        System.out.println("      .withDefaultSubscription();");
        System.out.println();

        System.out.println("Step 4 / 步骤四: Create a Resource Group");
        System.out.println("  ResourceGroup rg = azure.resourceGroups()");
        System.out.println("      .define(\"myResourceGroup\")");
        System.out.println("      .withRegion(\"eastus\")");
        System.out.println("      .create();");
        System.out.println();

        System.out.println("Step 5 / 步骤五: Deploy resources (e.g., a Virtual Machine)");
        System.out.println("  azure.virtualMachines()");
        System.out.println("      .define(\"myVM\")");
        System.out.println("      .withRegion(\"eastus\")");
        System.out.println("      .withExistingResourceGroup(rg)");
        System.out.println("      .withNewPrimaryNetwork(\"10.0.0.0/28\")");
        System.out.println("      .withPrimaryPrivateIPAddressDynamic()");
        System.out.println("      .withoutPrimaryPublicIPAddress()");
        System.out.println("      .withPopularLinuxImage(KnownLinuxVirtualMachineImage.UBUNTU_SERVER_20_04_LTS)");
        System.out.println("      .withRootUsername(\"adminUser\")");
        System.out.println("      .withSsh(sshPublicKey)");
        System.out.println("      .withSize(VirtualMachineSizeTypes.STANDARD_D2_V3)");
        System.out.println("      .create();");
        System.out.println();

        System.out.println("--- Azure Resource Deployment Benefits / Azure 资源部署的优势 ---");
        System.out.println("* Infrastructure as Code (基础设施即代码)");
        System.out.println("* Auto-scaling and high availability (自动扩缩容与高可用性)");
        System.out.println("* Pay-as-you-go pricing (按需计费)");
        System.out.println("* Global data center network (全球数据中心网络)");
        System.out.println("* Integrated security and compliance (集成安全与合规)");
        System.out.println();

        System.out.println("=== End of Azure Agent Introduction / Azure Agent 介绍结束 ===");
    }
}
