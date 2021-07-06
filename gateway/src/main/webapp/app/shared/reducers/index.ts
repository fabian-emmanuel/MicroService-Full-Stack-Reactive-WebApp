import { loadingBarReducer as loadingBar } from 'react-redux-loading-bar';

import locale, { LocaleState } from './locale';
import authentication, { AuthenticationState } from './authentication';
import applicationProfile, { ApplicationProfileState } from './application-profile';

import administration, { AdministrationState } from 'app/modules/administration/administration.reducer';
import userManagement, { UserManagementState } from './user-management';
// prettier-ignore
import tag from 'app/entities/blog/tag/tag.reducer';
// prettier-ignore
import product from 'app/entities/store/product/product.reducer';
// prettier-ignore
import blog from 'app/entities/blog/blog/blog.reducer';
// prettier-ignore
import post from 'app/entities/blog/post/post.reducer';
/* jhipster-needle-add-reducer-import - JHipster will add reducer here */

const rootReducer = {
  authentication,
  locale,
  applicationProfile,
  administration,
  userManagement,
  tag,
  product,
  blog,
  post,
  /* jhipster-needle-add-reducer-combine - JHipster will add reducer here */
  loadingBar,
};

export default rootReducer;
