package Property Details. Automation;

import java.util.List;

import PropertyDetails.Automation.interfaces. ProjectDeatilsInterface;

import PropertyDetails.Automation.interfaces.impl.Shobha;

import Property Details. Automation.responses.ProjectDetail;

public class ProjectDeatilsApplication {

public static void main(String[] args) throws InterruptedException {

ProjectDeatilsInterface projectDeatilsInterface = new Shobha();

List<ProjectDetail> projectDeatils projectDeatilsInterface.getProjectDeatils();

int i=1;

for(ProjectDetail data: projectDeatils) {

System.out.println(" --------------Property "+i+" ----------------------");

System.out.println(data.getProjectName());

System.out.println(data.getAddressLine1());

System.out.println(data.getAddressLine2());

System.out.println("--------------------------------------------------");

i++;

}

}

//

}
