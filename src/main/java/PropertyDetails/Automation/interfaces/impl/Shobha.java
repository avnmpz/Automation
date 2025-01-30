package PropertyDetails.Automation.interfaces.impl;

import java.io.IOException;

import java.util.List; |

import java.util.Properties;

import Property Details. Automation.common.functions. Details RetrieveFunctions;

import Property Details. Automation.interfaces. Project DeatilsInterface;

import Property Details. Automation.responses. ProjectDetail;

public class Shobha implements ProjectDeatilsInterface {

private Details RetrieveFunctions function;

public List<ProjectDetail> getProjectDeatils() {

function = new Details RetrieveFunctions();

final Properties properties = new Properties();

try {

properties.load(getClass().getClassLoader().getResourceAsStream("xpathlist.properties"));

function.openWebsite (properties.getProperty("shobha.url")); 
return function.getDetails(properties.getProperty("shobha.title"), properties.getProperty("shobha.addressline1"),
properties.getProperty("shobha.addressline2"));

} catch (InterruptedException e) {

// TODO Auto-generated catch block e.printStackTrace();

} catch (IOException e) {

// TODO Auto-generated catch block e.printStackTrace();

}

return null;

}
}
