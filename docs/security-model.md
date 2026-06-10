# Security Model

## Controls

- Original documents are encrypted at rest
- Configurable automatic retention expiry
- Redaction approval separated by role
- Sensitive text excluded from application logs

## Threat Assumptions

- External input is untrusted and must be validated.
- Credentials and secrets never belong in the repository.
- Automated findings require human review before consequential action.
- Logs must support investigation without exposing sensitive payloads.
