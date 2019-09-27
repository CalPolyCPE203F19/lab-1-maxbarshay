import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class ExampleMap
{
   public static List<String> highEnrollmentStudents(
      Map<String, List<Course>> courseListsByStudentName, int unitThreshold)
   {
      List<String> overEnrolledStudents = new LinkedList<>();

      /*
         Build a list of the names of students currently enrolled
         in a number of units strictly greater than the unitThreshold.
      */
    int unitCount = 0;
    for (String key : courseListsByStudentName.keySet()){
        for (Course my_course : courseListsByStudentName.get(key)){
          unitCount += my_course.getNumUnits();
        }
        if (unitCount > unitThreshold){
          overEnrolledStudents.add(key);
        }
    unitCount = 0;
    }

      return overEnrolledStudents;      
   }
}


// if (courseListsByStudentName.getValue().getNumUnits() > unitThreshold){
//           overEnrolledStudents.add(key);
//         }