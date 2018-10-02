/*
 * Title: Object destructuring illustration - 2
 */

const user = {
  firstName: 'Mubeen',
  lastName: 'Jukaku',
  links: {
    social: {
      linkedin: 'https://www.linkedin.com/in/mubeen-jukaku-b639445/',
      blog: 'https://blog.emertxe.com'
    }
  }
};

// Annoying!
//const twitter = user.links.social.twitter;
//const facebook = user.links.social.facebook;

const { linkedin, blog } = user.links.social;
console.log(linkedin, blog); // log the variables 
