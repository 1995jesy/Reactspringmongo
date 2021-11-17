import React from 'react';


class Form extends React.Component {
    constructor(props) {
      super(props);
      this.state = {
        details: {},
        errors: {}
      }

      this.handleChange = this.handleChange.bind(this);
      this.StudentInformationForm = this.StudentInformationForm.bind(this);

    };

    handleChange(e) {
      let details = this.state.details;
      details[e.target.name] = e.target.value;
      this.setState({
        details
      });

    }
    StudentInformationForm(e) {
      e.preventDefault();
      let details= this.state.details;
      console.log('details=>'+JSON.stringify(details));
      if (this.validateForm()) {
          let details = {};
          details["username"] = "";
          details["birthday"] = "";
          details["standard"] = "";
          details["division"] = "";
          details["gender"] = "";
          this.setState({details:details});

          alert("Information has been submitted");
      }  
    }
 
    validateForm() {

      let details = this.state.details;
      let errors = {};
      let formIsValid = true;

      if (!details["username"]) {
        formIsValid = false;
        errors["username"] = "*Please enter your username.";
      }

      if (typeof details["username"] !== "undefined") {
        if (!details["username"].match(/^[a-zA-Z ]*$/)) {
          formIsValid = false;
          errors["username"] = "*Name should be only in letter and space";
        }
      }

      if (!details["birthday"]) {
        formIsValid = false;
        errors["birthday"] = "*Please enter your Date of birth";
      }

      if (!details["standard"]) {
        formIsValid = false;
        errors["standard"] = "*Please enter your standard";
      }
      
      if (!details["division"]) {
        formIsValid = false;
        errors["division"] = "*Please enter your standard";
      }     
      this.setState({
        errors: errors
        
      });
      return formIsValid;
    }

  render() {
    return (   
    <div id="main-registration-container">
  
        <h1>Student Information</h1>
        <form method="post"  name="StudentInformationForm"  onSubmit= {this.StudentInformationForm} >
        <label>Enter the full name</label>
        <input type='text' placeholder= "Full Name"  name="username" value={this.state.details.username} onChange={this.handleChange} />
        <div className="errorMsg">{this.state.errors.username}</div>
        <label>Enter your date of birth</label>
        <input type='date' placeholder= "birthday" name="birthday" value={this.state.details.birthday} onChange={this.handleChange}  />
        <div className="errorMsg">{this.state.errors.birthday}</div>
        <label>Enter the Standard</label>
        <select name='select'name="standard" value={this.state.details.standard} onChange={this.handleChange} >
                      <option value="Select">Select</option><option value="I">I</option><option value="II">II</option>
                      <option value="III">III</option><option value="IV">IV</option><option value="V">V</option>
                      <option value="VI">VI</option><option value="VII">VII</option><option value="VIII">VIII</option>
                      <option value="IX">IX</option><option value="X">X</option><option value="XII">XII</option>
                      <option value="X12">X12</option>
                      </select><div className="errorMsg">{this.state.errors.standard}</div>
        <label> Enter the Division</label>
        <select name='select'name="division" value={this.state.details.division} onChange={this.handleChange} >
                       <option value="Select">Select</option>
                      <option value="I">A</option> <option value="II">B</option> <option value="III">C</option>
                      </select><div className="errorMsg">{this.state.errors.division}</div>
          <label> Gender: </label>
                <input type='radio' name="fav_language"
                value={this.state.details.gender} onChange={this.handleChange}/>Male
                <input type='radio'  className="form-control"  name="fav_language"
                value={this.state.gender} onChange={this.handleChange}/>female
                <div className="errorMsg">{this.state.errors.gender}  </div>
                <button type="submit" className="button"  value="submit">Submit</button>    
        </form>
    </div>
      );
  }
}

export default Form;