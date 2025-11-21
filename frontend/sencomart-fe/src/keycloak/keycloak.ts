import Keycloak from 'keycloak-js';

const keycloak: any = new Keycloak({
  url: 'http://localhost:9082/',
  realm: 'spring',
  clientId: 'DoAnTN',
});

export default keycloak;
